package com.ltm.sms.stumanagesystem.controller;

import com.ltm.sms.stumanagesystem.domain.entity.Score;
import com.ltm.sms.stumanagesystem.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/score")
@CrossOrigin
public class ScoreController {
    @Resource
    private ScoreService scoreService;

    @PostMapping("/getScores")
    public ResponseEntity<List<Score>> getScoreList(@RequestBody Score score)
    {
        List<Score> scores = this.scoreService.getScoreList(score);
        return ResponseEntity.ok(scores);
    }

    @PostMapping("/add")
    public void addScore(@RequestBody Score score)
    {
        this.scoreService.addScore(score);
    }

    @GetMapping("/del")
    public void delScore(Integer id)
    {
        this.scoreService.delScore(id);
    }

    @PostMapping("/update")
    public void updateScore(@RequestBody Score score)
    {
        this.scoreService.updateScore(score);
    }
}
