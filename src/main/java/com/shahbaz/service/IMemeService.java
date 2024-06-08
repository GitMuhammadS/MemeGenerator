package com.shahbaz.service;

import java.util.Optional;

import com.shahbaz.model.MemeItem;

public interface IMemeService {
		
	public Iterable<MemeItem> getAll();
	public Optional<MemeItem> getById(Long id);
	public MemeItem save(MemeItem memeItem);
	public void deleteById(Long id);
}
