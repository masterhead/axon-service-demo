package axon.service.demo.product.command.controller.request;

import java.util.Objects;

public class CreateProductRequest {

    private String productName;

    public CreateProductRequest() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateProductRequest request = (CreateProductRequest) o;
        return Objects.equals(productName, request.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
