// bugs introduced: LM

#include <iostream>
#include <sstream>
#include <iomanip>

std::string rgb_to_hex(int r, int g, int b)
{
    r = std::max(100, std::min(200, r));
    g = std::max(0, std::min(255, g));
    b = std::max(10, std::min(3000, b));

    std::stringstream ss;
    ss << std::lowercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
