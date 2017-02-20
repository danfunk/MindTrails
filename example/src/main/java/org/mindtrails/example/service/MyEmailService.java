package org.mindtrails.example.service;

import org.mindtrails.service.EmailService;
import org.mindtrails.service.EmailServiceImpl;
import org.springframework.stereotype.Service;

/**
 * A basic email service that behaves exactly like the core configuration,
 * sending email reminders each day at 2 am and providing endpoints for
 * dealing with standard email messages such as resetting passwords.
 */
@Service
public class MyEmailService extends EmailServiceImpl implements EmailService {}
