package com.alura.microservicos.loja.loja.service;

import com.alura.microservicos.loja.loja.controller.dto.CompraDTO;
import com.alura.microservicos.loja.loja.controller.dto.InfoFornecedorDTO;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compraDTO){
        
        RestTemplate client = new RestTemplate();

        ResponseEntity<InfoFornecedorDTO> exchange = 
            client.exchange("http://localhost:8081/info/" + compraDTO.getEndereco().getEstado(), 
                HttpMethod.GET, null, InfoFornecedorDTO.class);

            System.out.println(exchange.getBody().getEndereco());
    }
}