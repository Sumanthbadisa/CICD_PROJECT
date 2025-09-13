package com.klu.CICDPROJECT.service;

 

import com.klu.CICDPROJECT.entity.ContactMessage;
import com.klu.CICDPROJECT.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessageService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public List<ContactMessage> getAllMessages() {
        return contactMessageRepository.findAll();
    }

    public ContactMessage saveMessage(ContactMessage message) {
        return contactMessageRepository.save(message);
    }

    public void deleteMessage(Long id) {
        contactMessageRepository.deleteById(id);
    }
}
