package com.example.easynotes;

import com.example.easynotes.model.Note;
import com.example.easynotes.model.Users;
import com.example.easynotes.repository.NoteRepository;
import com.example.easynotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    // Get All Notes
    @GetMapping("/users")
    public List<Users> getAllNotes() {
        return userRepository.findAll();
    }
}
