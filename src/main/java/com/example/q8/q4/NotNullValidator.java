package com.example.q8.q4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NotNullValidator {

    public static List<String> validate(Object target) {
        try {
            List<String> messages = new ArrayList<String>();
            Class<Item> clazz = Item.class;

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                NotNull annotation = field.getAnnotation(NotNull.class);
                if (annotation == null) {
                    continue;
                }
                if (field.get(target) != null) {
                    continue;
                }
                messages.add(annotation.message());
            }
            return messages;

        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}