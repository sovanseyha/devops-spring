package com.example.todo_list_management.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BodyResponse<T> {
    private Boolean success;
    private Timestamp date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T payload;
}
