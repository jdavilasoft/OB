using API_Rest_002_university.Models.DataModels;
using Microsoft.EntityFrameworkCore;

namespace API_Rest_002_university.DataAccess
{
    public class UniversityDBContext: DbContext
    {
        public UniversityDBContext(DbContextOptions<UniversityDBContext> options) : base(options) { 
        
        }

        // Agregamos los DBSets (Tablas de la BD)
        public DbSet<User>? Users { get; set; }
        public DbSet<Curso>? Curso { get; set; }
    }   
}
