package com.code.controller;

import com.code.model.Invoice;
import com.code.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/invoice")
public class InvoiceController {

	private final InvoiceService invoiceService;

	@Autowired
	public InvoiceController(InvoiceService invoiceService){
		this.invoiceService = invoiceService;
	}
	@GetMapping("")
	public String invoice(Model model){
		List<Invoice> list = invoiceService.getInvoice();
		model.addAttribute("invoice", list);
		return "admin/invoice";
	}
}
