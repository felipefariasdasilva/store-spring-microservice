package com.alura.microservicos.loja.loja.service;

import com.alura.microservicos.loja.loja.controller.dto.CompraDTO;
import com.alura.microservicos.loja.loja.controller.dto.InfoFornecedorDTO;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CompraService {

    public void realizaCompra(CompraDTO compraDTO){
        
        RestTemplate client = new RestTemplate();
        
        compraDTO.getEndereco().getEstado();

        ResponseEntity<InfoFornecedorDTO> exchange = 
            client.exchange("http://localhost:8081/info/" + compraDTO.get getEndereco().getEstado(), 
                HttpMethod.GET, null, InfoFornecedorDTO.class);

            System.out.println(exchange.getBody().getEndereco());
    }
}