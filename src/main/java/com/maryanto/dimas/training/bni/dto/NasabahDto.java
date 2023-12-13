package com.maryanto.dimas.training.bni.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class NasabahDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NewRequest {
        @NotNull
        @NotEmpty
        @Size(min = 5, max = 5, message = "CIF field tidak boleh lebih dari dan kurang dari 5 character")
        private String cif;
        @NotEmpty(message = "Nama Depan tidak boleh kosong!")
        private String namaDepan;
        private String namaBelakang;
    }
}
