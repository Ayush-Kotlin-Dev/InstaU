package ayush.ggv.instau.home.onboarding

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import ayush.ggv.instau.R
import ayush.ggv.instau.common.fakedata.FollowsUser
import ayush.ggv.instau.ui.theme.LargeSpacing
import ayush.ggv.instau.ui.theme.MediumSpacing

@Composable
fun OnBoardingSection(
    modifier: Modifier = Modifier,
    users : List<FollowsUser>,
    onUserClick: (FollowsUser) -> Unit,
    onFollowButtonClick: (Boolean, FollowsUser) -> Unit,
    onBoardingFinish : () -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = stringResource(id = R.string.on_boarding_title),
            modifier = modifier
                .fillMaxWidth()
                .padding(top = MediumSpacing),
            style = MaterialTheme.typography.subtitle1,
            textAlign = TextAlign.Center
        )
        Text(
            text = stringResource(id = R.string.oboarding_guidance_subtitle),
            modifier = modifier
                .fillMaxWidth()
                .alpha(0.6f)
                .padding(top = MediumSpacing),
            style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(LargeSpacing))

        UsersRow(
            users =  users,
            onUserClick = onUserClick,
            onFollowButtonClick = onFollowButtonClick
        )
        OutlinedButton(
            onClick = { onBoardingFinish() },
            modifier = modifier
                .fillMaxWidth(fraction = 0.5f)
                .align(Alignment.CenterHorizontally)
                .padding(vertical = LargeSpacing),
            shape = RoundedCornerShape(50),
        ) {
            Text(text = stringResource(id = R.string.onboarding_button_text))

        }
    }
}

@Composable
fun UsersRow(
    modifier: Modifier = Modifier,
    users: List<FollowsUser>,
    onUserClick: (FollowsUser) -> Unit,
    onFollowButtonClick: (Boolean, FollowsUser) -> Unit

) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(LargeSpacing),
        contentPadding = PaddingValues(horizontal = LargeSpacing)
    ) {
        items(items = users, key = { followUser -> followUser.id }) { index ->
            OnBoardingUserItem(
                followsUser = index,
                onUserClick = onUserClick,
                onFollowButtonClick = onFollowButtonClick
            )
        }

    }


}

@Preview( showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun PreviewOnBoardingSection() {
    OnBoardingSection(
        users = listOf(
            FollowsUser(
                id = 1,
                name = "Ayush",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 2,
                name = "Vaibhav",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 3,
                name = "Paras",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 4,
                name = "Omkar",
                profileUrl = "https://picsum.photos/200"
            )
        ),
        onUserClick = {},
        onFollowButtonClick = { _, _ -> },
        onBoardingFinish = {}
    )
}

@Preview
@Composable
fun PreviewUsersRow() {
    UsersRow(
        users = listOf(
            FollowsUser(
                id = 1,
                name = "Ayush",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 2,
                name = "Vaibhav",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 3,
                name = "Paras",
                profileUrl = "https://picsum.photos/200"
            ),
            FollowsUser(
                id = 4,
                name = "Omkar",
                profileUrl = "https://picsum.photos/200"
            )
        ),
        onUserClick = {},
        onFollowButtonClick = { _, _ -> }
    )
}