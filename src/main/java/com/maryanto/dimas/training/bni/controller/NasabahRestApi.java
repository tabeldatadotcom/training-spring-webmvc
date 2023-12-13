package com.maryanto.dimas.training.bni.controller;

import com.maryanto.dimas.training.bni.dto.NasabahDto;
import com.maryanto.dimas.training.bni.model.Nasabah;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @PostMapping("/save")
    public ResponseEntity<?> save(
            @RequestBody @Valid NasabahDto.NewRequest data) {
        Nasabah nasabah = new Nasabah(
                UUID.randomUUID().toString(),
                "001",
                data.getNamaDepan() + data.getNamaBelakang(), BigDecimal.ZERO);
        return ResponseEntity.ok(nasabah);
    }
}
