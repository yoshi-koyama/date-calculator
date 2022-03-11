DROP TABLE IF EXISTS date_calculation_formulas;
CREATE TABLE date_calculation_formulas (
  id INT unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  year_to_add INT NOT NULL,
  month_to_add INT NOT NULL,
  day_to_add INT NOT NULL,
  PRIMARY KEY(id)
);
INSERT INTO date_calculation_formulas (name, year_to_add, month_to_add, day_to_add) VALUES ("1年後", 1, 0, 0);
INSERT INTO date_calculation_formulas (name, year_to_add, month_to_add, day_to_add) VALUES ("1ヶ月後", 0, 1, 0);
INSERT INTO date_calculation_formulas (name, year_to_add, month_to_add, day_to_add) VALUES ("1日後", 0, 0, 1);
