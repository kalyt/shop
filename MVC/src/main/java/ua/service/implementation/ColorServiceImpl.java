package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ua.entity.Color;
import ua.form.ColorFilter;
import ua.repository.ColorRepository;
import ua.service.ColorService;
import ua.service.implementation.specification.ColorFilterAdapter;
@Service
public class ColorServiceImpl implements ColorService{

	@Autowired
	private ColorRepository colorRepository;
	@Override
	public void delete(String name) {
		colorRepository.delete(name);
		
	}

	

	@Override
	public Color findByName(String name) {
		
		return colorRepository.findByName(name);
	}

	@Override
	public List<Color> findAll() {
		
		return colorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		colorRepository.delete(id);
		
	}



	@Override
	public void save(Color color) {
		colorRepository.save(color);
		
	}



	@Override
	public Color findOne(int id) {
		
		return colorRepository.findOne(id);
	}



	@Override
	public Page<Color> findAllPageable(Pageable pageable,ColorFilter form) {
		
		return colorRepository.findAll(new ColorFilterAdapter(form),pageable);
	}

}
