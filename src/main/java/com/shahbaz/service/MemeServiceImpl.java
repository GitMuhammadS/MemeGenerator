package com.shahbaz.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.model.MemeItem;
import com.shahbaz.repository.IMemeRepository;

@Service
public class MemeServiceImpl implements IMemeService{
	@Autowired
	private IMemeRepository repo;
	
	@Override
	public Iterable<MemeItem> getAll() {
		
		return repo.findAll();
	}

	@Override
	public Optional<MemeItem> getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public MemeItem save(MemeItem memeItem) {
		// TODO Auto-generated method stub
		if(memeItem.getId()==null) {
			memeItem.setCreatedAt(LocalDateTime.now());
		}
		memeItem.setUpdatedAt(LocalDateTime.now());
		return repo.save(memeItem);
			
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}

}
