SELECT FH.FLAVOR
FROM FIRST_HALF FH
JOIN ICECREAM_INFO IC
ON FH.FLAVOR = IC.FLAVOR
WHERE FH.TOTAL_ORDER > 3000
  AND IC.INGREDIENT_TYPE = 'fruit_based'
ORDER BY FH.TOTAL_ORDER DESC;