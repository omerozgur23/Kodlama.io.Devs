package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	
	Language getById(int id);
	
	void update(int id, String newName);
	
	void add(Language language);
	
	void delete(int id);

}
