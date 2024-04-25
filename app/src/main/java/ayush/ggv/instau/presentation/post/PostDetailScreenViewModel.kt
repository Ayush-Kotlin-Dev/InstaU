package ayush.ggv.instau.presentation.post

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ayush.ggv.instau.common.fakedata.Comment
import ayush.ggv.instau.common.fakedata.Post
import ayush.ggv.instau.common.fakedata.sampleComments
import ayush.ggv.instau.common.fakedata.samplePosts
import kotlinx.coroutines.launch

class PostDetailScreenViewModel :ViewModel() {

    var postUiState by mutableStateOf(PostDetailUiState())

    var commentsUiState by mutableStateOf(CommentsUiState())

    fun fetchData(postId : String){
        viewModelScope.launch {
            postUiState = postUiState.copy(isLoading = true)
            commentsUiState = commentsUiState.copy(isLoading = true)

            //Simulating network delay
            Thread.sleep(500)

            postUiState = postUiState.copy(
                isLoading = false,
                post = samplePosts.find { it.id == postId }
            )

            commentsUiState = commentsUiState.copy(
                isLoading = false,
                comments = sampleComments
            )
        }

    }

}

data class PostDetailUiState(
    val isLoading : Boolean = false,
    val post : Post? = null,
    val errorMessage : String? = null
)

data class CommentsUiState(
    val isLoading : Boolean = false,
    val comments : List<Comment> = listOf(),
    val errorMessage : String? = null
)