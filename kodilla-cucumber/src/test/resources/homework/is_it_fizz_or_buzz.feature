Feature:  Is it Fizz or Buzz?
  Scenario Outline: The number is or isn't divisible by 3 or 5 or both
    Given The number is <number>
    When I check the number
    Then It is <answer>
    Examples:
      | number | answer |
      | 0 | "FizzBuzz" |
      | 1 | "None" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |