package actions.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor //引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor


public class ReportView {
	private Integer id;

	private EmployeeView employee;

	private LocalDate reportDate;

	private String title;

	private String content;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;
}
