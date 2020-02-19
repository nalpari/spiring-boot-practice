package net.nalpari.travisci.web.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public long calculator(long a, long b) {
        return a + b;
    }
}
