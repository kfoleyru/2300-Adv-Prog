from datetime import datetime

date_str = "03-17-2022 10:45:30"
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

print(formatted_date)
