package com.example.fd_websocket.controller;

import com.example.fd_websocket.model.FaceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")

public class DeviceController {
    @RequestMapping("/test")
    ResponseEntity<FaceResponse> updateFaceRecord2() {
        // userRepo.put(user.getId(), user);

        FaceResponse faceResponse = new FaceResponse();
        faceResponse.setContent(null);
        faceResponse.setMsg("this is the message");
        faceResponse.setResult(200);
        return new ResponseEntity<>(faceResponse, HttpStatus.OK);
    }

}
