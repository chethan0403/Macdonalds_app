package com.dcl.dao;

import java.util.List;

import com.dcl.dto.Food;

public interface FoodDao {
	public boolean saveFood(Food f);
	public boolean deleteFood(Integer fid);
	public boolean updateFood(Food f);
	
	public List<Food> fetchCategory(Integer fid,String category);
	public List<Food> fetchFood(String fname);
	public List<Food> fetchAllFood();
	
}
