package controller;

import dto.InvoiceRequestObject;
import models.Invoice;
import service.InvoiceService;

public class InvoiceController {
    InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    public Invoice createInvoice(InvoiceRequestObject invoiceRequestObject) {
        Invoice invoice = this.invoiceService.createInvoice(invoiceRequestObject.getTicket(), invoiceRequestObject.getExitGate());
        return invoice;
    }
}