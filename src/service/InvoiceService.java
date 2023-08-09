package service;

import java.util.Date;
import models.Gate;
import models.Invoice;
import models.Payment;
import models.PaymentMode;
import models.Status;
import models.Ticket;
import service.ParkingSlotService;

public class InvoiceService {
    ParkingSlotService parkingSlotService = new ParkingSlotService();

    public Invoice createInvoice(Ticket ticket, Gate exitGate) {
        Date entryTime = ticket.getEntryTime();
        long start_millis = entryTime.getTime();
        Date exitTime = new Date();
        long end_millis = exitTime.getTime();
        double amount = (end_millis - start_millis) * 10L;
        Payment payment = Payment.builder().paymentId(1111).paymentMode(PaymentMode.Cash).amount(amount).build();
        Invoice invoice = Invoice.builder().invoiceId(121).exitGate(exitGate).exitTime(exitTime).ticket(ticket).payment(payment).build();
        this.parkingSlotService.setParkingSlot(ticket.getParkingSlot(), Status.Avaialble);
        return invoice;
    }
}