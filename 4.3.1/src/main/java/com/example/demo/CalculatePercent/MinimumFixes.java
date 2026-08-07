package com.example.demo.CalculatePercent;

import org.springframework.stereotype.Service;

@Service
public class MinimumFixes extends MainCalculation
{
    public String fix()
    {
        return "The house requires minimal repair";
    }
}
