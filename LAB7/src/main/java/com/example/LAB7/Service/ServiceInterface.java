package com.example.LAB7.Service;

import com.example.LAB7.Entities.Comments;
import com.example.LAB7.Entities.Posts;
import com.example.LAB7.Entities.Users;
import java.util.List;

public interface ServiceInterface {
    boolean addPost(Posts posts);
    boolean updatePost(Posts posts);
    Users getPostOwner(int postId);
    Users getCommentOwner(int commentId);
    List<Posts> listAllPosts();
    List<Posts> listAllPostsOfUser(int userId);
    boolean addComment(Comments comments);
    boolean updateComment(Comments comments);
    List<Comments> listAllComments();
    List<Comments> listAllCommentsOfPost(int postId);
}
