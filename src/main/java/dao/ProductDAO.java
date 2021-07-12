package dao;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    SQLConnection sqlConnection = new SQLConnection();
    Connection connection = sqlConnection.getConnection();

    public ProductDAO() throws SQLException, ClassNotFoundException {
    }

    private final String SHOW_LIST = "SELECT * FROM product;";
    private final String INSERT_PRODUCT = "INSERT INTO product VALUES (?, ?, ?, ?, ?, ?, ?);";
    private final String DELETE_PRODUCT = "DELETE FROM product WHERE ProductId =?;";
    private final String FIND_BY_ID = "SELECT * FROM product BY ProductId =?;";
    private final String UPDATE_STUDENT = "UPDATE product SET productId = ?, productName = ?, productPrice = ?, productQuantity = ?, productColor = ?, description =?, productCategory where id = ?";


    public List<Product> showListProduct() throws SQLException {
        List<Product> products = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(SHOW_LIST);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int productId = resultSet.getInt("productId");
            String productName = resultSet.getString("productName");
            int productPrice = resultSet.getInt("productPrice");
            int productQuantity = resultSet.getInt("productQuantity");
            String productColor = resultSet.getString("productColor");
            String productDescription = resultSet.getString("productDescription");
            String productCategory = resultSet.getString("productCategory");
            products.add(new Product(productId, productName, productPrice, productQuantity, productColor, productDescription, productCategory));
        }
        return products;
    }
    public void addProduct(Product product) throws SQLException {
    PreparedStatement preparedStatement =connection.prepareStatement(INSERT_PRODUCT);
        preparedStatement.setInt(1, product.getProductId());
        preparedStatement.setString(2, product.getProductName());
        preparedStatement.setInt(3, product.getProductPrice());
        preparedStatement.setInt(4, product.getProductQuantity());
        preparedStatement.setString(5, product.getProductColor());
        preparedStatement.setString(6, product.getDescription());
        preparedStatement.setString(7, product.getProductCategory());
        preparedStatement.executeUpdate();
    }
    public Product findById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int productId = resultSet.getInt("productId");
            String productName = resultSet.getString("productName");
            int productPrice = resultSet.getInt("productPrice");
            int productQuantity = resultSet.getInt("productQuantity");
            String productColor = resultSet.getString("productColor");
            String description = resultSet.getString("description");
            String productCategory = resultSet.getString("productCategory");
            return new Product(productId, productName, productPrice, productQuantity, productColor, description, productCategory);
        }
        return null;
    }

    public void delete(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    public void Update(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT);
        preparedStatement.setInt(1, product.getProductId());
        preparedStatement.setInt(3, product.getProductPrice());
        preparedStatement.setString(2, product.getProductName());
        preparedStatement.setInt(4, product.getProductQuantity());
        preparedStatement.setString(5, product.getProductColor());
        preparedStatement.setString(6, product.getDescription());
        preparedStatement.setString(7, product.getProductCategory());
        preparedStatement.executeUpdate();
    }
}
