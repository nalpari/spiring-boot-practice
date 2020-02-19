package net.nalpari.travisci.web.controller;

import lombok.RequiredArgsConstructor;
import net.nalpari.travisci.web.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService service;

    @GetMapping(value = {"", "/"})
    public long test() {
        return service.calculator(1, 2);
    }
}
