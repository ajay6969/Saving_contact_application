package in.ajayit.service;

import java.util.List;

import in.ajayit.binding.Contact;

public interface ContactService {

	public String saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);

	public String deleteContactById(Integer contactId);

}
