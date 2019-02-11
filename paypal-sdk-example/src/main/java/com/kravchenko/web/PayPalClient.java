package com.kravchenko.web;

import com.kravchenko.model.exception.ProcessingException;
import com.paypal.api.payments.Payment;

public interface PayPalClient {

    Payment createPayment(String paymentAmount);

    String executePaypalCall(Payment payment) throws ProcessingException;

    CompletedPaymentDto completePayment(String paymentId, String payerId) throws ProcessingException;
}
