package com.klu.CICDPROJECT.controller;

 
import com.klu.CICDPROJECT.entity.Skill;
import com.klu.CICDPROJECT.service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    @PostMapping
    public Skill addSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }
}
