#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    std::string date_str = "03-17-2022 10:45:30";
    std::tm date_obj = {};
    std::istringstream ss(date_str);
    ss >> std::get_time(&date_obj, "%m-%d-%Y %H:%M:%S");
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");
    std::string formatted_date = formatted_date_ss.str();

    std::cout << formatted_date << std::endl;

    return 0;
}

// KFR
