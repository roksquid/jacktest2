package com.example.jacktest2.controller;

import com.example.jacktest2.entities.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RestNoticeController {


    // 게시판 - page
    @GetMapping("/notices")
    public ResponseEntity showNotices(@PageableDefault(size = 10, page = 0) Pageable pageable) {

        return ResponseEntity.ok("test1111");
    }


    // 게시판 - getOne
    @GetMapping("/notices/{id}")
    public ResponseEntity showNoticeOne(@PathVariable("id") Long id) {

        return ResponseEntity.ok("111");
    }


    // 게시판 - 제목 중복 조회
    @GetMapping("/notices/title={title}")
    public ResponseEntity showNoticeTitleEquals(@PathVariable("title") String title) {

        return ResponseEntity.ok("111");
    }


    // 게시판 - 다운로드
    @GetMapping("/notices/file/{id}")
    public ResponseEntity showNoticeFileDownload(@PathVariable("id") Long id) {

        return ResponseEntity.ok("1111");
    }


    // 게시판 - 생성
    @PostMapping("/notices")
    public ResponseEntity showNoticeAdd(@Valid Notice notice,
                                        BindingResult bindingResult,
                                        @RequestParam(value = "uploadFile01", required = false, defaultValue = "NONE") MultipartFile file01) {

        return ResponseEntity.ok("1111");
    }


    // 게시판 - 수정
    @PutMapping("/notices/{id}")
    public ResponseEntity showNoticeEdit(@Valid Notice notice,
                                         BindingResult bindingResult,
                                         @PathVariable("id") Long id,
                                         @RequestParam(value = "uploadFile01", required = false, defaultValue = "NONE") MultipartFile file01) {

        return ResponseEntity.ok("111");
    }


    // 게시판 - 삭제 / 단수
    @DeleteMapping("/notices/{id}")
    public ResponseEntity showNoticeDelete(@PathVariable("id") Long id) {

        return ResponseEntity.ok("111");
    }


    // 게시판 - 삭제 / 복수
    @DeleteMapping("/notices/{idList}")
    public ResponseEntity showNoticeDeleteAll(@PathVariable("idList") List<Long> idList) {

        return ResponseEntity.ok("111");
    }


}