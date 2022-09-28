package com.example.appviagem.dto;

import com.example.appviagem.model.ListPackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PackageDto {

	public List<ListPackage> list() {
		return new ArrayList<>(Arrays.asList(
			new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99")),
			new ListPackage("Belo Horizonte", "belo_horizonte_mg", 3, new BigDecimal("451.99")),
			new ListPackage("Rido de Janeiro", "rio_de_janeiro_rj", 1, new BigDecimal("751.99")),
			new ListPackage("Recife", "recife_pe", 4, new BigDecimal("751.99"))
		));
	}
}
