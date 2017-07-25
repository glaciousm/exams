package gr.iteam.istqbexams.security;

import java.util.List;

import gr.iteam.istqbexams.model.Result;

public interface ResultService {

	Result findByUserId(int id);

	void save(Result result);

	List<Result> list();

}
