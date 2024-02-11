package telran.java51.student.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	Integer id;
	String name;
	Map<String, Integer> scores;
}
