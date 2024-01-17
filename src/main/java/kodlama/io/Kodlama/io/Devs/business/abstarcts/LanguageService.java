package kodlama.io.Kodlama.io.Devs.business.abstarcts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	
	Language getById(int id) throws Exception;
	
	void update(int id, String newName) throws Exception;
	
	void add(Language language);
	
	void delete(int id);

}
