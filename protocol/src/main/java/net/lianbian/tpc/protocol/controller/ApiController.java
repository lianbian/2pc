package net.lianbian.tpc.protocol.controller;

import net.lianbian.tpc.protocol.handler.HandlerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private HandlerManager handlerManager;

    @RequestMapping(params = {"command"}, method = RequestMethod.POST)
    @ResponseBody
    String handleTransactionReq(HttpServletRequest request, @RequestParam String command, @RequestParam String data) {
        return handlerManager.handle(command, data);
    }
}
