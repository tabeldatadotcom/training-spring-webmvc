package com.maryanto.dimas.training.bni.controller;

import com.maryanto.dimas.training.bni.model.Nasabah;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/nasabah/v1")
public class NasabahRestApi {

    @GetMapping("/list")
    public List<Nasabah> findAll() {
        List<Nasabah> list = new ArrayList<>();
        list.add(new Nasabah(
                "01",
                "01",
                "Dimas",
                BigDecimal.valueOf(100000)));
        return list;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") String id) {
        Nasabah dimas = new Nasabah(id, "01", "Dimas Maryanto", BigDecimal.valueOf(100000));
        if (id.equalsIgnoreCase("001")) {
            return ResponseEntity.badRequest().body("Invalid param!");
        }

        return ResponseEntity.ok(dimas);
    }
}
