package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	List<Language> language;

	public InMemoryLanguageRepository() {
		language = new ArrayList<Language>();
		language.add(new Language(1, "Java"));
		language.add(new Language(2, "C#"));
		language.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {
		return language;
	}

	@Override
    public Language getById(int id) {
        for (Language language : language) {
            if(language.getId() == id){
                return language;
            }
        }
        return null;
    }
	
	@Override
	public void update(int id, String newName) {
		Language programmingLanguage2 = getById(id);
		programmingLanguage2.setName(newName);
	}
	
	@Override
	public void add(Language langauge) {
		language.add(langauge);
	}
	
	@Override
	public void delete(int id) {
		for (Language l : language) {
			if (l.getId() == id) {
				language.remove(l);
			}
		}
	}
	

}
