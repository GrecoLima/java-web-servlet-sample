package br.com.greco.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriedade {

	/*
	 * 
	 * Le arquivo properties.
	 * 
	 * */
	public static Properties getProp() throws IOException {
		
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/dados.properties");
		
		props.load(file);
		
		return props;
		
	}
	/*
	 * 
	 * Le arquivo properties passado por parametro
	 * 
	 * */
	public static Properties getProperties(String string) throws IOException {
		
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(string);
		
		props.load(file);
		
		return props;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		String nome;
		String codigo;
		
		System.out.println("********** Teste de leitura de properties **********");
		
		Properties prop = getProp();
		nome = prop.getProperty("nome");
		
		System.out.println(nome);
	
		Properties props = getProperties("./properties/dados2.properties");
		codigo = props.getProperty("codigo");
		
		System.out.println(codigo);
		
		
		
	}
}
