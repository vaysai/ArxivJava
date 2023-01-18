package com.vaysai.arxiv.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "openai-client", url = "${openAIApi.url}")
public interface OpenArxivClient {

}