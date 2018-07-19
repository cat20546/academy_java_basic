package shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import shop.exception.DuplicateException;
import shop.exception.NotFoundException;
import shop.mapper.ProductMapper;
import shop.mybatis.MybatisClient;
import shop.vo.Product;

public class MybatisWarehouse implements GeneralWarehouse {
	
	private SqlSessionFactory factory;
	
	public MybatisWarehouse() {
		factory = MybatisClient.getFactory(); 
	}

	@Override
	public int add(Product product) throws DuplicateException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product get(Product product) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int set(Product product) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Product product) throws NotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> getAllProducts() {
		// 1. SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// 2. Mapper 인터페이스 객체를 session에서 얻기
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		List<Product> products = null;
		
		try {
			// 3. mapper 를 통하여 조회
			products = mapper.selectAll();
		} finally {
			// 4. session 닫기
			if (session != null)
				session.close();
		}
		
		return products;
	}
	
	
	// isExists 지원 메소드 작성
	private boolean isExists(Product product) {
		boolean isExists = false;
		
		// 1. SqlSession 얻기
		SqlSession session = factory.openSession();
		
		// 2. Mapper 인터페이스 객체를 session에서 얻기
		ProductMapper mapper;
		mapper = session.getMapper(ProductMapper.class);
		
		// 3. mapper 객체에 메소드 호출로 쿼리 실행
		try {
			String prodCode = mapper.isExists(product);
			if (prodCode != null) {
				isExists = true;
			}
		} finally {
			// 4. session 닫기
			if (session != null)
				session.close();
		}
		
		return isExists;
	}
}






