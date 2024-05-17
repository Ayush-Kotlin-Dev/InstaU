package ayush.ggv.instau.data.postcomments.domain

import ayush.ggv.instau.model.CommentResponse
import ayush.ggv.instau.model.GetCommentsResponse
import ayush.ggv.instau.model.NewCommentParams
import ayush.ggv.instau.model.RemoveCommentParams
import ayush.ggv.instau.util.Result


interface PostCommentsRepository {

    suspend fun addComment(
        params : NewCommentParams,
        token : String
    ): Result<CommentResponse>

    suspend fun removeComment(params : RemoveCommentParams , token: String): Result<CommentResponse>

    suspend fun getComments(postId : Long , pageNumber : Int , pageSize : Int , token: String ): Result<GetCommentsResponse>



}