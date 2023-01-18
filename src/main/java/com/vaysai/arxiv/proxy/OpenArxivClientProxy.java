package com.vaysai.arxiv.proxy;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vaysai.arxiv.client.OpenArxivClient;



@Component
@RequiredArgsConstructor
@Log4j2
public class OpenArxivClientProxy {

    private final OpenArxivClient openAIClient;


}
