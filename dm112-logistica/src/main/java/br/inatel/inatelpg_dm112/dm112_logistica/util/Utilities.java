package br.inatel.inatelpg_dm112.dm112_logistica.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Utilities {

	public static LocalDate getDate(String dataString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate data = LocalDate.parse(dataString, formatter);
			return data;
		} catch (DateTimeParseException e) {
			System.err.println("Erro ao converter a string para data: " + e.getMessage());
			return null;
		}
	}
}
