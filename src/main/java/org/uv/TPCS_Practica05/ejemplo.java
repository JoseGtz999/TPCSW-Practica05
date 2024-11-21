/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package org.uv.TPCS_Practica05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author josegtz
 */
@RestController
@RequestMapping("/url")
public class ejemplo {
    @GetMapping
    public String sayHello(){
        return "hola mundo";
    }
    
}
