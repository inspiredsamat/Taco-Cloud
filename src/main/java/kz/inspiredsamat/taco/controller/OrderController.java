package kz.inspiredsamat.taco.controller;

import jakarta.validation.Valid;
import kz.inspiredsamat.taco.model.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @author inspiredsamat
 * @portfolio <a href="https://inspiredsamat.github.io">Personal portfolio</a>
 */

@Controller
@RequestMapping("/orders")
@Slf4j
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("current")
    public String orderForm() {
        return "orderForm";
    }

    @PostMapping
    public String processOrder(@Valid TacoOrder tacoOrder, Errors errors, SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "orderForm";
        }

        log.info("Order submitted: {}", tacoOrder);
        sessionStatus.setComplete();

        return "redirect:/";
    }
}
