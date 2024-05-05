package ayush.ggv.instau.presentation.screens.home

import androidx.compose.runtime.Composable
import ayush.ggv.instau.presentation.screens.destinations.PostDetailDestination
import ayush.ggv.instau.presentation.screens.destinations.ProfileDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Composable
@Destination(start = true)

fun Home(
    navigator: DestinationsNavigator
) {
    val viewModel: HomeScreenViewModel = koinViewModel()

    HomeScreen(
        onBoardingUiState = viewModel.onBoardingUiState,
        postsUiState = viewModel.postsUiState,

        onPostClick = {
            navigator.navigate(PostDetailDestination(it.id))

        },
        onProfileClick = { userId ->
            navigator.navigate(ProfileDestination(userId))

        },
        onLikeClick = { postId ->

        },
        onCommentClick = { postId ->

        },
        onBoardingFinish = {

        },
        onUserClick = { user ->

        },
        onFollowClick = { isFollowing, user ->

        },
        fetchData = {
            viewModel.fetchData()
        }
    )
}