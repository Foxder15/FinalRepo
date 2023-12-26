package com.code.service;

import com.code.model.Invoice;
import com.code.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

	private final InvoiceRepository invoiceRepository;

	@Autowired
	public InvoiceService(InvoiceRepository invoiceRepository){
		this.invoiceRepository = invoiceRepository;
	}

	public List<Invoice> getInvoice(){
		return (List<Invoice>) invoiceRepository.findAll();
	}
}
